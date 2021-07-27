
public class Week09 {
	/*
	 Week 09 - Understanding Concurrency in Java using Threads
	 
	 W9P1 - Introduction to Threads in Java
	 
	 Thread
	 	a sequence of executing instructions that can run independently
	 	for example, you have a program and when you compile that program it will be runnable/executable
	 	that will be named a process, and that process can be composed of many threads running at the same time
	 	and sharing the memory for that process to run
	 	
	 JVM allows an application to have multiple threads of executing running concurrently
	 each thread is associated with an instance of class Thread
	 
	 Threads organize programs into logically separated paths
	 can perform tasks independent of other threads
	 can share access to common resources
	 
	 Cannot control OS behavior - cannot rely on thread priority for algorithm correctness
	 
	 Two strategies for using Thread objects:
	  	-directly control thread creation by building a Thread object
	  	-abstract thread management by passing application's tasks to an executor
	  	
	 	note that threads are expensive operations, should not (in industry) be creating multiple threads, second
	 	option is preferred
	  	
	  	
	 W9P2 - Basic of Class Thread
	 	see Week09_MyExamThread
	 
	 	run needs to be implemented, when we call start method this run method is run instead
	  	run method could be called directly (but it is not how to handle this method)
	  	
	  	this program is composed of two threads: the main and the object (new MyExamThread ...) which is a thread too
	  	
	 W9P3 - Functional Interface Runnable
	 	see Week09_MyExamRunnable
	 	this differs from above in that it does not extend Thread but implements Runnable
	 	
	 	Runnable is a functional interface which consists of an abstract method run()
	 	
	 	differs in code by:
	 		(new Thread(new MyExamRunnable(75))).start();
	 		
	 		here we are using a different constructor for class Thread that accepts a Runnable as argument
	 		
	 SO THESE ARE TWO WAYS OF CREATING A THREAD
	 	either by extending Thread or implementing Runnable
	 	
	 Note class Thread itself implements Runnable
	  	
	 Also since Runnable is an interface we can use lambda expression instead 	
	 So we pass implementation of Run
	 
	 Example:
	 	new Thread( () -> System.out.println(10)).start();
	 	
	W9P4 - Threads and Join
	 	see Week09_SimpleThread
	 	
	 	running will produce different results, despite starting t1 first it may not start first or finish first
	 	
	W9P5 - Introduction to Threads Synchronization in Java
	 	can have many programs composed of parts, that only one thread should be executing those parts at any
	 	given time; those parts are called critical sections (also called monitors)
	 	
	 	Synchronization is built around concept known as intrinsic lock
	 	every object in Java has an intrinsic lock associated with it
	 	
	 	any thread that needs to access that objects monitor (or critical section) must acquire that objects
	 	intrinsic lock
	 	this blocks other threads from acquiring that lock
	  	
	  	way we accomplish this in Java is we have synchronized keyword that can be used before method/block
	  	if we have method called synchronized in any object that will be shared among different threads
	  	first thread that gets that key locks that object
	  	
	  	since it can be expensive to do so, since other threads have to wait until the method (which can be large) is
	  	finished; it could be better to have statements that are dealing with these critical sections as synchronized
	  	
	  	in synchronized statement, thread release is done with last statement in executed
	  	
	 W9P6 - SynThread
	 	see Week09_SynThread
	  	
	  	instead of:
	  		public void run() { ....
	  	can change to:
	  		public synchronized void run() {  ... // synchronized keyword comes before type
	  	
	  	this means the first thread that will run will lock and other thread cannot proceed as it doesn't have the lock
	  	
	  	note it is possible for thread 1 to come first then the other thread (thread 0)
	  
	 W9P7 - BankCredit
	 	see Week09_BankCredit
	 	
	 	we could make the whole method, creditAccount synchronized
	 	however it will not be efficient; there is only one 'part' that we can have an issue which is part that deals
	 	with our shared balance
	 	
	 	when we used synchronized we should state under which object we are locking
	 	
	 	synchronized (this) {.....}
	  	
	 W9P8 - Synchronized vs Unsynchronized parts
	 	if we have an object, that has some synchronized part; we have a thread that is running the synchronized code
	 	and the other threads could be running the unsynchronized code (until that first thread is done)
	 	
	 	if we have shared object that is composed of several methods, some synchronized, some are not
	 	assume one thread is executing one of those synchronized methods on this object 
	 	what happens if a second thread wants to access this object;
	 	yes it can access the unsynchronized part is still available to all other threads
	 	
	 W9P9 - Liveness Problems
	 	liveness problems can happen when running a concurrent application
	 	
	 	deadlock
	 		when two or more threads are blocked forever, waiting on each other
	 		see Week09_Deadlock
	 		
	 		in this example we lock r1, then lock r2 then sleep for first thread
	 		in the other thread the same but opposite synch
	 		
	 	starvation
	 		where a thread is unable to gain access to shared resources and is unable to make progress
	 		for example we have a shared resource, and several different threads and one of them is of the lowest
	 		priority and never gains access to that shared resource (and can never proceed)
	 		
	 	livelock
	 		if other threads action is also a response to the action of another thread, then livelock may result
	 		this differs from deadlock as both threads are alive but stuck
	 		
	 		example being two people walking towards each other in a hallway, then bump into each other, one mores right
	 		the other left. this continues without end
	 	
	 		common solutions: immutable Objects, high level concurrency
	 		
	  W9P10 - Guarded Blocks, Wait Method, And Being Careful About Calling That
	  	threads must coordinate their actions (work together)
	  	guarded blocks are the most common coordination mechanism for threads coordination
	  	
	  	up until now we have used synchronization but it does not dictate any sort of ordering
	  	it only guarantees we do not have simultaneous access to shared resources
	  	
	  	Guarded block uses three methods from Object class
	  	
	  	wait() causes current thread to wait until another thread invokes notify() method or notifyAll() method for this object
	  	
	  	see Week09_BeCarefulAboutWait
	  	here in our Account.java we have a withdraw method
	  	if the amount is more than what we have in account
	  	it waits
	  	then it completes when the balance is increased sufficiently
	  	
	  	deposit method will deposit, then will notify the other thread waiting
	  	
	  	problem is first will attempt to withdraw 15000, it will then wait and other will deposit 1000, then
	  	it will notify, this means it will go back and continue WITHOUT CHECKING THAT BALANCE IS SUFFICIENT
	  	
	  	should have a check inside a while loop (see code)
	  	
	  W9P11 - Guarded Blocks, Notify And NotifyAll Methods, and Producer-Consumer Problem
	  
	  	notify() method does not allow you to specify which thread should be woken up
	  	that is the OS's call
	  	
	  	see Week09_SharedResource
	  	one shared container between two threads, one is a producer the other consumer
	  	idea being that the producer produces something into the container, then the consumer comes and consumes it
	  	and that continues along
	  	
	  	
	  	
	  	
	 */

}
