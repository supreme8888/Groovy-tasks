@Library("test-runner-lab") _
import com.mnt_lab.*

def testRunner = new tests()
node("build-on-ec2") {
	stage("Run tests") {
		git branch:scm.branches[0].name,  url: 'https://github.com/MNT-Lab/Groovy-tasks.git'
	}
	testRunner.exec()
}
