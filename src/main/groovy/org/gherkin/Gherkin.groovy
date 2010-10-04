package org.gherkin

def cli = new CliBuilder(usage: 'java -jar gherkin.jar [gherkin files]')
def options = cli.parse(args)
def filesToParse = options.arguments()

if (filesToParse[0] == null) {
	cli.usage()
} else {
    for (file in filesToParse) {
    	def fileHandle = new File (file);
		if (!fileHandle.exists()) {
			println file + " does not appear to exist....  Skipping"
		} else {
			println "Processing [" + file + "]"
		}
    }
}