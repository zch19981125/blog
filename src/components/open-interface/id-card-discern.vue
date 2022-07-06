<template>
  <div style="background:#eee;padding: 20px">
    <result-show>
      <Row type="flex" justify="center" align="middle">
        <Col span="11">
          <Card style="height: 30vh">
            <vue-upload></vue-upload>
          </Card>
        </Col>
        <Col span="1">
        </Col>
        <Col span="11">
          <Card style="height: 30vh">
            <slot></slot>
          </Card>
        </Col>
      </Row>
    </result-show>
    <request-show>
      <Tabs value="name1" class="ddd">
        <Tab-pane label="调用说明" name="name1">调用说明</Tab-pane>
        <Tab-pane label="返回说明" name="name2">返回说明</Tab-pane>
        <Tab-pane label="请求示例" name="name3">请求示例</Tab-pane>
      </Tabs>
    </request-show>
  </div>
</template>

<script>
import ResultShow from '../../common/result-show'
import RequestShow from '../../common/request-show'
export default {
  name: 'id-card-discern',
  components: {RequestShow, ResultShow}
}
</script>

<style scoped>

</style>
