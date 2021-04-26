pipeline{
	agent any 
	stages{
		stage('Uploading library'){
				environment {
					MAVEN_HOME = '/usr/share/maven'
				}
			steps{
				script{
					sh 'echo STARTING DEPLOYING'
				}
				
				rtMavenDeployer (
					id: 'BUBBLE_SORT',
					serverId: 'artifactory',
					releaseRepo: 'parcial2-is',
				)
				rtMavenRun (
					pom: 'pom.xml',
					goals: 'install',
					deployerId: 'BUBBLE_SORT'
				)
				script{
					sh 'echo FINING DEPLOYING'
				}
			
			}
		}
		stage ('documenting builder artefactory info') {
            steps {
                rtPublishBuildInfo (
                    serverId: "artifactory"
                )
            }
        }
	}
}
