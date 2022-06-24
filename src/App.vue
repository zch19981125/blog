<template>
  <div id="home" style="width: 100%;height: 100%;">
    <Menu mode="horizontal"  active-name="1">
      <Menu-item :active-name="$route.path" name="/" to="/">
        <Icon type="ios-paper"></Icon>
        个人主页
      </Menu-item>
      <Menu-item :active-name="$route.path" name="project" to="project">
        <Icon type="ios-people"></Icon>
        项目经历
      </Menu-item>
      <Menu-item  :active-name="$route.path" name="art" to="art">
        <Icon type="ios-people"></Icon>
        技术经验
      </Menu-item>
      <Menu-item name="4">
        <Icon type="settings"></Icon>
        综合设置
      </Menu-item>
      <Menu-item name="5">
        <Icon type="settings"></Icon>
        开放接口
      </Menu-item>
    </Menu>
    <router-view>
    </router-view>
  </div>
</template>

<script>
export default {
  name: 'App',
  data () {
    return {
      value2: false,
      isShowMenu: false,
      windowWidth: document.documentElement.clientWidth
    }
  },
  methods: {
    mouseOver () {
      this.isShowMenu = true
    },
    mouseLeave () {
      this.isShowMenu = false
    }
  }
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50
}

.ivu-menu-vertical .ivu-menu-item-group-title {
  height: 8px;
}

.home /*设置占满屏幕*/
{
  background-color: red;
  width: 100%;
  height: 100px;
  margin: 0;
}

.home_title {
  width: 100%;
  height: 60px;
  background-color: #0593d3;
  margin: 0;
}
.ivu-modal-footer {
  padding: 0 0 0 0
}
</style>
