var consumerUrl = 'http://localhost:7011'

export const requestTypeConfig = (requestType) => {
  return {'content-type': requestType}
}

export const ProjectUrl = consumerUrl + '/project/'

export const formRequest = 'application/x-www-form-urlencoded'
