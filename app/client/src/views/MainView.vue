<script setup lang="ts">
import MainStatistics from '@/components/MainStatistics.vue';
import Nav from '@/components/Nav.vue';




</script>

<template>

    <div class="main-view-wrapper">
        <Nav/>
        <MainStatistics/>
    </div>


</template>

<style scoped>
    .main-view-wrapper{
        width:100%;
        display: flex;
    }

</style>