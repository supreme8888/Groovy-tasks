@Library("test-runner-lab") _
import com.mnt_lab.*

def testRunner = new tests()
node("build-on-ec2") {
	stage("Run tests") {
		git branch:'rdymov',  url: 'git@git.epam.com:Vitali_Ulantsau/groovy-tasks.git'
	}
	testRunner.exec()
}
