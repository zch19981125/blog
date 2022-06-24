<template>
  <div class="hello">
    <VueTable :columns="columns" :page="page" :data="data" @changePage="handleSearch"></VueTable>
    <!--    <Table :columns="columns"></Table>-->
  </div>
</template>

<script>
import VueTable from '../../common/VueTable'
import {listPage} from '../../api/project-api'

export default {
  name: 'project-list',
  components: {VueTable},
  data () {
    return {
      columns: [
        {
          type: 'index',
          title: '序号',
          width: 120,
          align: 'center'
        },
        {
          title: '项目名称',
          key: 'projectName',
          align: 'center',
          maxWidth: 300
        },
        {
          title: '所在公司',
          key: 'company',
          align: 'center',
          width: 230
        },
        {
          title: '技术',
          key: 'artStr',
          align: 'center',
          minWidth: 80
        },
        {
          title: '简介',
          key: 'content',
          align: 'center',
          minWidth: 100
        },
        {
          title: '工作时间',
          key: 'workTime',
          align: 'center',
          width: 180
        },
        {
          title: '操作',
          key: 'address',
          align: 'center',
          maxWidth: 240
        }
      ],
      page: {
        total: 100,
        size: 10,
        current: 1
      },
      data: [],
      searchParam: {}
    }
  },
  methods: {
    handleSearch (page) {
      if (!page) {
        page = this.page
      }
      listPage(page, this.searchParam).then(res => {
        console.log(res)
      })
    }
  }
}
</script>

<style scoped>

</style>
