import axios from 'axios'

var consumerUrl = 'http://localhost:7011'

export const requestTypeConfig = (requestType) => {
  return {'content-type': requestType}
}

export const ProjectUrl = consumerUrl + '/project/'

export const LoginUrl = consumerUrl + '/login'

export const formRequest = 'application/x-www-form-urlencoded'

export const isLogin = () => {
  return axios.request({
    method: 'get',
    url: ProjectUrl + 'isLogin'
  })
}
