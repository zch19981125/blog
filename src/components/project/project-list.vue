<template>
  <div class="hello">
    <VueTable :columns="columns" :page="page"></VueTable>
<!--    <Table :columns="columns"></Table>-->
  </div>
</template>

<script>
import VueTable from '../../common/VueTable'

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
          key: 'name'
        },
        {
          title: '工作时间',
          key: 'age'
        },
        {
          title: '机构',
          key: 'address'
        },
        {
          title: '工作时间',
          key: 'age'
        },
        {
          title: '机构',
          key: 'address'
        },
        {
          title: '工作时间',
          key: 'age'
        },
        {
          title: '机构',
          key: 'address'
        }
      ],
      page: {
        total: 10
      }
    }
  }
}
</script>

<style scoped>

</style>
