import { createRouter, createWebHistory } from 'vue-router'//删除Hash 去掉url中的#

const routes = [
  
]

const router = createRouter({
  history: createWebHistory(),
  routes
})

export default router
