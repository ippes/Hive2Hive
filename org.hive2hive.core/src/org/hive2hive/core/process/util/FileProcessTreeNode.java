package org.hive2hive.core.process.util;

import java.io.File;

import org.hive2hive.core.process.Process;

/**
 * Additionally holds a {@link File}
 * 
 * @author Nico
 * 
 */
public class FileProcessTreeNode extends ProcessTreeNode {
	private final File file;

	public FileProcessTreeNode(Process process, ProcessTreeNode parent, File file) {
		super(process, parent);
		this.file = file;
	}

	public FileProcessTreeNode() {
		super();
		this.file = null;
	}

	public File getFile() {
		return file;
	}
}