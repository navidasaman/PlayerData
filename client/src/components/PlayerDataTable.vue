<template>
  <div class="w-full flex justify-center font-sans text-left sm:p-0 p-4">
    <table
      class="bg-[#36304a] text-white rounded-t-lg w-full sm:w-[80vw] shadow-lg mt-12 mb-10"
    >
      <thead>
        <tr>
          <th class="tableHeaders">
            Birth Date
            <span v-if="toggledSorting">
              <font-awesome-icon
                icon="fa-solid fa-arrow-down"
                class="cursor-pointer ml-2"
                @click="toggleSortingByDOB" 
                title="Press for descending order"
              />
            </span>
            <span v-if="!toggledSorting">
              <font-awesome-icon
                icon="fa-solid fa-arrow-up"
                class="cursor-pointer ml-2"
                @click="toggleSortingByDOB" 
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
        <tr v-for="player in sortedPlayersList" :key="player.id" class="odd:bg-gray-100 even:bg-white text-gray-500">
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
  // Recieving props from the parent component 'PlayersData' describing its type and that it is required 
  props: {
    sortedPlayersList: {
      type: Array,
      required: true,
    },
    toggledSorting: {
      type: Boolean,
      required: true,
    },
  },
  methods: {
    toggleSortingByDOB() {
      this.$emit("toggleSortingByDOB");
    },
  },
};
</script>