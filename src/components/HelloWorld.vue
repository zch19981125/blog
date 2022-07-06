<template>
  <div class="hello" style="height:95vh; background:#eee;padding: 20px;">
    <Row type="flex" justify="center" align="top">
      <Col span="15" offset="3">
        <Card style="width: 80%;height: 95vh">
          <div style="text-align:center;height: 90vh;overflow-y: auto" class="input-box-iframe">
            <iframe frameborder="0" style="width: 80%;height: 100vh;overflow-y: auto" src="static/d.html">
            </iframe>
          </div>
        </Card>
      </Col>
      <Col span="3">
        <Row type="flex" justify="space-between" class="code-row-bg" style="margin-top: 2vh">
          <Col span="24" style="margin-top: 10px">
            <Button size="large" type="info">导出word</Button>
          </Col>
          <Col span="24" style="margin-top: 10px">
            <Button size="large" type="info">导出pdf</Button>
          </Col>
          <Col span="24" style="margin-top: 10px">
            <Button size="large" type="warning">打印简历</Button>
          </Col>
        </Row>
      </Col>
    </Row>
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  data () {
    return {
      msg: 'Welcome to Your Vue.js App'
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h1, h2 {
  font-weight: normal;
}

ul {
  list-style-type: none;
  padding: 0;
}

li {
  display: inline-block;
  margin: 0 10px;
}

a {
  color: #42b983;
}

.f18 > :first-child {
  font-size: 23px;
}
</style>
