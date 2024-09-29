<template>
    <table>
      <thead>
        <tr>
          <th>Birth date</th>
          <th>First Name</th>
          <th>Last Name</th>
          <th>City</th>
        </tr>
      </thead>
      <tbody>
        <tr>
          <td>1993-09-08</td>
          <td>John</td>
          <td>Doe</td>
          <td>Gothenburg</td>
        </tr>
        <tr>
          <td>1993-09-08</td>
          <td>John</td>
          <td>Doe</td>
          <td>Gothenburg City</td>
        </tr>
      </tbody>
    </table>
</template>

<script>
export default {
  name: "HelloWorld",
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
  padding-left: 5px;
  padding-right: 5px;
}

tbody tr:nth-child(odd) td {
  background-color: white; 
}

tbody tr:nth-child(even) td {
  background-color: #f2f2f2; 
}

@media (min-width: 300px) and (max-width: 850px) {
  table {
    width: 90vw;
  }
}
</style>
