Spring Batch Reading Tab Separated File Example
===============================================

The file is read from the folder where the mvn command is run. Upon successful
completion, a file is created in the same folder.

To run this example, execute the following command (in a single line)

mvn exec:java -Dexec.mainClass=org.springframework.batch.core.launch.support.CommandLineJobRunner 
-Dexec.args="tsv-config.xml tsvJob inputFile=inputfile.txt outputFile=outputFile.txt"


What is happening?
===================

Spring Batch reads the input file and splits it into individual lines for processing, The lines are
then processed in "chunks" and written into the output file


