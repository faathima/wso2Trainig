package com.test;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;


public class client {
	

		/**
		 * Get a track by its ID
		 * 
		 * @param trackId
		 *            ID of the track
		 */
		public static void getTrack(String trackId) {

			try {

				URL url = new URL(
						"http://10.215.33.13:9763/test_1.0.0/services/album/album/track/"
								+ trackId);
				HttpURLConnection conn = (HttpURLConnection) url.openConnection();
				conn.setRequestMethod("GET");

				if (conn.getResponseCode() != 200) {
					throw new RuntimeException("Failed : HTTP error code : "
							+ conn.getResponseCode());
				}

				BufferedReader br = new BufferedReader(new InputStreamReader(
						(conn.getInputStream())));

				String output;
				System.out.println("Output from Server .... ");
				while ((output = br.readLine()) != null) {
					System.out.println(output);
				}

				System.out.println();

				conn.disconnect();

			} catch (MalformedURLException e) {

				e.printStackTrace();

			} catch (IOException e) {

				e.printStackTrace();

			}

		}

		/**
		 * Add a new track
		 * 
		 * @param trackId
		 *            ID of a track
		 * @param name
		 *            name of the track
		 * @param singer
		 *            singer of the track
		 * @param year
		 *            year that the track has composed
		 */
		public static void addTrack(String trackId, String name, String singer,
				String year) {
			// Build parameter string
			String data = "id=" + trackId + "&name=" + name + "&singer=" + singer
					+ "&year=" + year;
			try {

				// Send the request
				URL url = new URL(
						"http://10.215.33.13:9763/test_1.0.0/services/album/album/track/add");
				URLConnection conn = url.openConnection();
				conn.setDoOutput(true);
				OutputStreamWriter writer = new OutputStreamWriter(
						conn.getOutputStream());

				// write parameters
				writer.write(data);
				writer.flush();

				// Get the response
				StringBuffer answer = new StringBuffer();
				BufferedReader reader = new BufferedReader(new InputStreamReader(
						conn.getInputStream()));

				System.out.println("Output from Server .... ");

				String line;
				while ((line = reader.readLine()) != null) {
					answer.append(line);
				}
				writer.close();
				reader.close();

				// Output the response
				System.out.println(answer.toString());

				System.out.println();

			} catch (MalformedURLException ex) {
				ex.printStackTrace();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}

		/**
		 * Get names of tracks by year
		 * 
		 * @param year
		 *            year that the track has composed
		 */
		public static void getTracksByYear(String year) {
			try {

				URL url = new URL(
						"http://10.215.33.13:9763/test_1.0.0/services/album/album/query?year="
								+ year);
				HttpURLConnection conn = (HttpURLConnection) url.openConnection();
				conn.setRequestMethod("GET");

				if (conn.getResponseCode() != 200) {
					throw new RuntimeException("Failed : HTTP error code : "
							+ conn.getResponseCode());
				}

				BufferedReader br = new BufferedReader(new InputStreamReader(
						(conn.getInputStream())));

				String output;
				System.out.println("Output from Server .... ");
				while ((output = br.readLine()) != null) {
					System.out.println(output);
				}

				System.out.println();

				conn.disconnect();

			} catch (MalformedURLException e) {

				e.printStackTrace();

			} catch (IOException e) {

				e.printStackTrace();

			}
		}

		public static void main(String[] args) {

			// Testing the client
			getTrack("1");
			addTrack("4", "DUMMY_SONG_NAME", "DUMMY_SINGER", "2014");
			getTrack("4");
			getTracksByYear("2014");

		}

	}
