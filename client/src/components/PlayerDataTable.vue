<template>
  <div>
    <table>
      <thead>
        <tr>
          <th>
            Birth date
            <span v-if="toggledSorting">
              <font-awesome-icon
                icon="fa-solid fa-arrow-down"
                style="color: white; cursor: pointer"
                v-on:click="toggleSortingByBirthDate()"
              />
            </span>
            <span v-if="!toggledSorting">
              <font-awesome-icon
                icon="fa-solid fa-arrow-up"
                style="color: white; cursor: pointer"
                v-on:click="toggleSortingByBirthDate()"
              />
            </span>
          </th>
          <th>First Name</th>
          <th>Last Name</th>
          <th>City</th>
        </tr>
      </thead>
      <tbody>
        <tr v-for="player in sortedPlayers" :key="player.id">
          <td>{{ player.birth_date }}</td>
          <td>{{ player.first_name }}</td>
          <td>{{ player.last_name }}</td>
          <td>{{ player.city }}</td>
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
  async mounted() {            // After page has loaded (mounted)
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
        const response = await fetch("http://localhost:8080/players/");
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

<style scoped>
@import url("https://fonts.googleapis.com/css2?family=Open+Sans:ital,wght@0,300..800;1,300..800&display=swap");

table {
  background: #36304a;
  font-family: "Open Sans";
  color: white;
  border: none;
  border-top-left-radius: 10px;
  border-top-right-radius: 10px;
  border-collapse: collapse;
  width: 100%;
  width: 70vw;
  overflow-y: auto;
  margin: auto;
}
th {
  font-size: 18px;
  border: none;
  font-weight: 400;
  padding-top: 15px;
  padding-bottom: 15px;
  padding-left: 5px;
  padding-right: 5px;
}
td {
  border: none;
  text-align: center;
  padding-top: 10px;
  padding-bottom: 10px;
  background: white;
  color: grey;
  padding-left: 10px;
  padding-right: 10px;
}

tbody tr:nth-child(odd) td {
  background-color: white;
}

tbody tr:nth-child(even) td {
  background-color: #f2f2f2;
}

@media (min-width: 411px) and (max-width: 850px) {
  table {
    width: 90vw;
    overflow-y: auto;
  }
}

@media (min-width: 300px) and (max-width: 409.99px) {
  table {
    width: 90vw;
    margin-top: calc(37%);
  }
}
</style>
