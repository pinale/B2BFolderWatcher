package com.pinale;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.nio.file.*;

@SpringBootApplication
public class B2BFolderWatcherApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(B2BFolderWatcherApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//https://www.baeldung.com/java-nio2-watchservice
		System.out.println("====== Inizializzato ======");

		
		Path dir = Paths.get("C:\\B2B");
        new WatchDir(dir,true).processEvents();
		
		/*
		WatchService watchService = FileSystems.getDefault().newWatchService();
	
		Path path = Paths.get("C:\\B2B");
		path.register(watchService, StandardWatchEventKinds.ENTRY_CREATE,StandardWatchEventKinds.ENTRY_DELETE,StandardWatchEventKinds.ENTRY_MODIFY);
		
		
		WatchKey key;
		while ( (key = watchService.take()) != null) {
			
			for(WatchEvent<?> event : key.pollEvents())
			{
				System.out.println(event.context() + "  " + event.kind());
			}
			
			key.reset();  //riposizione la WatchKey nella coda del watchService, se non facio non è piu in grado di rilevare eventi
		}
		*/
		System.out.println("====== Qui non dovrebbe mai arrivarci ======");
	}

}

