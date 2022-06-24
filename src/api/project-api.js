import axios from 'axios'
import {formRequest, ProjectUrl, requestTypeConfig} from './common/common-request'

export const listPage = (page, project) => {
  let postParams = Object.assign({}, project)
  Object.assign(postParams, page)
  return axios.request({
    method: 'post',
    url: ProjectUrl + 'list',
    data: postParams,
    headers: requestTypeConfig(formRequest)
  })
}
