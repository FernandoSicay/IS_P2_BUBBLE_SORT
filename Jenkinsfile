pipeline{
	agent any 
	stages{
		stage('Uploading library'){
				environment {
					MAVEN_HOME = '/usr/share/maven'
				}
			steps{
				
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
