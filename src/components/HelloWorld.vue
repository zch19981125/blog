<template>
  <div class="hello" style="height:95vh; ">
    <Row type="flex" justify="center" align="top">
      <Col span="15" offset="3">
        <iframe frameborder="0" style="width: 80%;height: 95vh;overflow-y: hidden" src="static/d.html">
        </iframe>
      </Col>
      <Col span="3" >
        <Row type="flex" justify="space-between" class="code-row-bg" style="margin-top: 2vh">
          <Col span="5">
            <Button size="large" type="info">导出word</Button>
          </Col>
          <Col span="5" offset="1">
            <Button size="large" type="info">导出pdf</Button>
          </Col>
          <Col span="5" >
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
