<template>
  <div>
    <table border="1">
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
  </div>
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
}
th {
  font-size: 18px;
  border: none;
  font-weight: 400;
}
td {
  border: none;
  text-align: center;
  padding-top: 10px;
  padding-bottom: 10px;
  background: white;
  color: grey;
}

@media (min-width: 600px) {
  table {
    width: 70vw;
  }
  th {
    padding-top: 15px;
    padding-bottom: 15px;
  }
  td {
    border: none;
    text-align: center;
    padding: 10px;
  }
}

@media (min-width: 300px) and (max-width: 599.99px) {
  table {
    width: 90vw;
  }
 th {
    padding-top: 15px;
    padding-bottom: 15px;
    padding-left: 5px;
    padding-right: 5px;
  }
  td {
    padding-left: 5px;
    padding-right: 5px;
  }
}
</style>
