<script setup lang="ts">
import FitnessDay from '@/components/FitnessDay.vue';
import Nav from '@/components/Nav.vue';


</script>

<template>
    <div class="fitness-view-wrapper">
        <Nav/>
        <FitnessDay/>
    </div>
</template>

<style>
    .fitness-view-wrapper{
        width:100%;
        display: flex;
    }
</style>