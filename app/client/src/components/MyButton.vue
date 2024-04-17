<template>
    <button> {{ name }}</button>
</template>

<script setup lang="ts">
const props = defineProps({
    name:{
        type: String,
        default: 'Button'
    }
})
</script>