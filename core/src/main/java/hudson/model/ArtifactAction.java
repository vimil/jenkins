package hudson.model;

import java.io.File;

public interface ArtifactAction extends Action {
	public File getArtifactsDir(Run<?, ?> run);
}
