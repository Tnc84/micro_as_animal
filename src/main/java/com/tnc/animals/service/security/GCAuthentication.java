//package com.tnc.animals.service.security;
//
//import com.google.api.gax.paging.Page;
//import com.google.auth.oauth2.GoogleCredentials;
//import com.google.cloud.bigquery.*;
//import com.google.cloud.storage.Bucket;
//import com.google.cloud.storage.Storage;
//import com.google.cloud.storage.StorageOptions;
//import com.google.common.collect.Lists;
//
//import java.io.FileInputStream;
//import java.io.IOException;
//
//public class GCAuthentication {
//    public static void main(String... args) throws Exception {
//        String jsonPath = "C:/Users/tncbo/Desktop/My work/Microservices/animal-shelter-351809-479e56280414.json";
//        authExplicit(jsonPath);
//        // Instantiate a client. If you don't specify credentials when constructing a client, the
//        // client library will look for credentials in the environment, such as the
//        // GOOGLE_APPLICATION_CREDENTIALS environment variable.
//        BigQuery bigquery = BigQueryOptions.getDefaultInstance().getService();
//
//        // The name for the new dataset
//        String datasetName = "animal-shelter-351809";
//
//        // Prepares a new dataset
//        Dataset dataset = null;
//        DatasetInfo datasetInfo = DatasetInfo.newBuilder(datasetName).build();
//
//        // Creates the dataset
//        dataset = bigquery.create(datasetInfo);
//
//        System.out.printf("Dataset %s created.%n", dataset.getDatasetId().getDataset());
//    }
//
//    static void authExplicit(String jsonPath) throws IOException {
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
//
//}
