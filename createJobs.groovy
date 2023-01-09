pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}
pipelineJob('cocus-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/mohamedjo/backendTaskCocusPortugal.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}
pipelineJob('cocus-job-docker') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/mohamedjo/backendTaskCocusPortugal.git'
                    }
                    branch 'master'
                    scriptPath('Jenkinsfile-docker')
                }
            }
        }
    }
}