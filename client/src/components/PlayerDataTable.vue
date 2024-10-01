<template>
  <div class="w-full flex justify-center font-sans text-left sm:p-0 p-4">
    <table class="bg-[#36304a] text-white rounded-t-lg w-full sm:w-[80vw] shadow-lg mt-12 mb-10" >
      <thead>
        <tr>
          <th class="tableHeaders">
            Birth Date
            <span v-if="toggledSorting">
              <font-awesome-icon
                icon="fa-solid fa-arrow-down"
                class="cursor-pointer ml-2"
                v-on:click="toggleSortingByBirthDate()"
                title="Press for descending order"
              />
            </span>
            <span v-if="!toggledSorting">
              <font-awesome-icon
                icon="fa-solid fa-arrow-up"
                class="cursor-pointer ml-2"
                v-on:click="toggleSortingByBirthDate()"
                title="Press for ascending order"
              />
            </span>
          </th>
          <th class="tableHeaders">First Name</th>
          <th class="tableHeaders">Last Name</th>
          <th class="tableHeaders">City</th>
        </tr>
      </thead>
      <tbody>
        <tr v-for="player in sortedPlayers" :key="player.id" class="odd:bg-gray-100 even:bg-white text-gray-500">
          <td class="tableData">{{ player.birth_date }}</td>
          <td class="tableData">{{ player.first_name }}</td>
          <td class="tableData">{{ player.last_name }}</td>
          <td class="tableData">{{ player.city }}</td>
        </tr>
      </tbody>
    </table>
  </div>
</template>

<script>
export default {
  data() {
    return {
      players: [], // will return data that was fetched
      toggledSorting: true,
    };
  },
  async mounted() {
    // After page has loaded (mounted)
    await this.fetchPlayers(); //  the fetchPlayers method will run
  },
  computed: {
    sortedPlayers() {
      // creates a copy of the original array of json-data based on dob, which is then sorted in asc/desc order
      return this.players.slice().sort((thisPlayer, otherPlayer) => {
        const player1 = new Date(thisPlayer.birth_date);
        const player2 = new Date(otherPlayer.birth_date);
        return this.toggledSorting ? player2 - player1 : player1 - player2;
      });
    },
  },
  methods: {
    // Fetches the player data
    async fetchPlayers() {
      try {
        const response = await fetch(`${process.env.VUE_APP_API_URL}/players`);
        if (!response.ok) {
          throw new Error(`HTTP error! status: ${response.status}`);
        }
        const data = await response.json();
        this.players = data; // The JSON-data will be returned in data(){...} if fetch request is successful
      } catch (error) {
        console.error("Error fetching player:", error);
        alert(`${error.message}`);
      }
    },
    toggleSortingByBirthDate() {
      this.toggledSorting = !this.toggledSorting;
      console.log(this.toggledSorting);
    },
  },
};
</script>