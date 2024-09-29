<template>
    <PlayerDataTable />
</template>

<script>
import PlayerDataTable from './components/PlayerDataTable.vue'

export default {
  name: 'App',
  components: {
    PlayerDataTable
  }
}
</script>

<style>
html, body {
  background: linear-gradient(45deg,#4158d0,#c850c0);
  margin:auto;
}

#app {
  font-family:'Open Sans',sans-serif;
  font-size: 15px;
  display: flex;
  justify-content: center; 
  align-items: center;
  height: 100vh;
  overflow: auto;
  margin-bottom:5%;
}
</style>
