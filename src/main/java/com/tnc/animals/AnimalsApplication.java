package com.tnc.animals;

import com.google.api.gax.paging.Page;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.storage.Bucket;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;
import com.google.common.collect.Lists;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileInputStream;
import java.io.IOException;

@SpringBootApplication
public class AnimalsApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(AnimalsApplication.class, args);
		String jsonPath = "C:/Users/tncbo/Desktop/My work/Microservices/animal-shelter-351809-479e56280414.json";
//        authExplicit(jsonPath);
	}

//	static void authExplicit(String jsonPath) throws IOException {
//        // You can specify a credential file by providing a path to GoogleCredentials.
//        // Otherwise credentials are read from the GOOGLE_APPLICATION_CREDENTIALS environment variable.
//
//        GoogleCredentials credentials = GoogleCredentials.fromStream(new FileInputStream(jsonPath))
//                .createScoped(Lists.newArrayList("https://www.googleapis.com/auth/cloud-platform"));
//        Storage storage = StorageOptions.newBuilder().setCredentials(credentials).build().getService();
//
//        System.out.println("Buckets:");
//        Page<Bucket> buckets = storage.list();
//        for (Bucket bucket : buckets.iterateAll()) {
//            System.out.println(bucket.toString());
//        }
//    }
}
