package org.appfuse.mojo.installer;

import org.appfuse.mojo.AbstractAppFuseMojoTestCase;

public class InstallArtifactsMojoTest extends AbstractAppFuseMojoTestCase {

    public void testCreateTestProject() throws Exception {
        createTestProject("appfuse-basic-struts", "2.0-m5-SNAPSHOT");
        assertTrue("can't find test-project's pom.xml", checkExists("target/test-project/pom.xml"));
    }

    /*public void testGenerateCore() throws Exception {
        createTestProject("appfuse-basic-struts", "2.0-m5-SNAPSHOT");
        File testPom = new File(getBasedir(), "target/test-project/pom.xml");

        MavenEmbedder maven = new MavenEmbedder();
        maven.setClassLoader(Thread.currentThread().getContextClassLoader());
        maven.setLogger(new MavenEmbedderConsoleLogger());

        maven.start();

        // can't find warpath plugin - embedded must not support plugins with extensions
        // MavenProject project = maven.readProjectWithDependencies(testPom);
        maven.stop();
    }*/
}