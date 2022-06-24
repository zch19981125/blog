<template>
  <div>
    <Table border style="margin: 10px;" size="large" :columns="columns" :data="data">
    </Table>
    <div style="margin: 10px;overflow: hidden">
      <div style="float: right;">
        <Page :total="page.total" :page-size="page.size" :current="page.current"
              @on-change="changePage" show-elevator
              @on-page-size-change="changePageSize"
              show-sizer></Page>
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
  },
  methods: {
    changePage (page) {
      var newPage = this.page
      newPage.current = page
      this.$emit('changePage', newPage)
    },
    changePageSize (pageSize) {
      var newPage = this.page
      newPage.size = pageSize
      this.$emit('changePage', newPage)
    }
  }
}
</script>

<style scoped>

</style>
