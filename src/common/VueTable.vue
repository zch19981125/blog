<template>
  <div>
    <Table style="margin: 10px;" size="large" :columns="columns" :data="data" >
    </Table>
    <div style="margin: 10px;overflow: hidden">
      <div style="float: right;">
        <Page :total="100" :current="1" @on-change="changePage"></Page>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: 'VueTable',
  props: {
    columns: {
      type: Array,
      default: () => []
    },
    data: {
      type: Array,
      default: () => []
    },
    page: Object
  },
  data () {
    return {}
  }
}
</script>

<style scoped>

</style>
