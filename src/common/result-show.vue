<template>
  <Card title="效果展示" style="width: 95%;height: 40vh;margin-left: 2%;" :bordered="true">
    <p slot="title" style="margin-left: 45%;height: 2vh">
      效果展示
    </p>
    <slot></slot>
  </Card>
</template>

<script>
export default {
  name: 'result-show'
}
</script>

<style scoped>

</style>
