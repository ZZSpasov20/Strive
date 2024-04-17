<template>
  <div>
    <input type="text" v-model="profile.name" />
    <h1 @click="changeHeadingName">{{ profile.name }}</h1>
    <MyButton name="DEMO"/>
  </div>
</template>

<script setup lang="ts">
import { ref } from 'vue'
import MyButton from './MyButton.vue';

const profile = ref({ name: 'Guest' })

const changeHeadingName = () => {
    profile.value.name = "soner1"
}

</script>

<style scoped>
div {
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  height: 100vh;
}
h1 {
  font-family: monospace;
  font-size: 10rem;
  color: darkslategrey;
}
input {
  font-size: 2rem;
  margin-top: 20px;
}
</style>
