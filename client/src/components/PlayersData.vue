<template>
  <div>
    <!-- v-bind prop binding & passing data to child component PlayerDataTable -->
    <PlayerDataTable      
      :sortedPlayersList="sortedPlayers" 
      :toggledSorting="toggledSorting" 
      @toggleSortingByDOB="toggleSortingByBirthDate"
    />
  </div>
</template>
<script>
import PlayerDataTable from "./PlayerDataTable.vue";

export default {
  components: {
    PlayerDataTable,
  },
  data() {
    return {
      players: [], // will return data that was fetched
      toggledSorting: true,
    };
  },
  async mounted() {             // After page has loaded (mounted)
    await this.fetchPlayers(); //  the fetchPlayers method will run
  },
  computed: {
    // creates a copy of the original array of json-data based on dob, which is then sorted in asc/desc order
    sortedPlayers() {
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