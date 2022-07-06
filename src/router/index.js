import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import projectList from '@/components/project/project-list'
import artList from '@/components/art/art-list'
import wordToPdf from '@/components/open-interface/word-to-pdf'
import idCardDiscern from '@/components/open-interface/id-card-discern'
import iView from 'iview'
import 'iview/dist/styles/iview.css'

Vue.use(Router)
Vue.use(iView)
export default new Router({
  mode: 'history',
  routes: [
    {
      path: '/',
      name: 'HelloWorld',
      component: HelloWorld
    },
    {
      path: '/project',
      name: 'projectList',
      component: projectList
    },
    {
      path: '/art',
      name: 'art',
      component: artList
    },
    {
      path: '/wordToPdf',
      name: 'wordToPdf',
      component: wordToPdf
    },
    {
      path: '/wechatPay',
      name: 'wechatPay',
      component: artList
    },
    {
      path: '/videoPlayer',
      name: 'videoPlayer',
      component: artList
    },
    {
      path: '/idCardDiscern',
      name: 'idCardDiscern',
      component: idCardDiscern
    }
  ]
})
