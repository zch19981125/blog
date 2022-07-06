<template>
  <Upload
      :show-upload-list="true"
      type="drag"
      action="//jsonplaceholder.typicode.com/posts/">
    <div style="padding: 20px 0">
      <Icon type="ios-cloud-upload" size="52" style="color: #3399ff"></Icon>
      <p>点击或将文件拖拽到这里上传</p>
    </div>
  </Upload>
</template>

<script>
import {isLogin} from '../api/common/common-request'

export default {
  name: 'vue-upload',
  props: {
    action: '',
    maxSize: '',
    format: ''
  },
  methods: {
    // 上传前
    isUpload () {
      debugger
      isLogin().then(res => {
        if (res.data.code === 200) {
          if (res.data.body) {
            return true
          }
          return false
        }
      })
      return true
    },
    success () {
    },
    error () {
    }
  }
}
</script>

<style scoped>

</style>
