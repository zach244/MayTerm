
Instructions for running RMI source code examples.
--------------------------------------------------

This is organized into two directories:

(1) server - which contains the RemoteDate interface and implementation.

(2) client - which contains the RMIClient code.


To run the remote date  files

SERVER
------
1. Compile all source files.

2. Start the registry (rmiregistry)

On UNIX/Linux/OS X, enter

	rmiregistry &

On Windows, enter

	start rmiregistry

(This has the rim registry running in the background.)

4. Create the remote object 

	java RMIServer	

This registers the remote date on the server with the RMI registry.

CLIENT
------

1. Copy the file

	RemoteDate.class 

from the server to the client directory.

2. Compile RemoteDate.java

3. Start the client

	java RMIClient

You should see the date appear on the client.

