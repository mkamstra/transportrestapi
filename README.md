# transportrestapi

Some initial thoughts:
Departure Times

Create a service that gives real-time departure time for public transportation (use freely available public API). The app should geolocalize the user.

Here are some examples of freely available data:

511 (San Francisco)
Nextbus (San Francisco)
Transport for London Unified API (London)

This is NOT a trip planner. It just displays real-time departure times for public transport services that stop at the selected station.

Use case:
1. Geolocalize user: simple Web GUI where user enters his/her location (lat/lon) or use ip address to locate. Multiple users at once possible
   Based on user's location determine closest station (bus/train/metro) 
   Determine the public transport services that pass this station
   Get the regular schedules of THESE transport services
   Get their real-time departures and compare to the schedules to compute expected departure (ignoring real-time traffic causing more delays on the way to the station for now)
   User gets a list with the upcoming departures of the different services
      - How big can this list be?

    List is displayed on the web gui


Extreme situations:
- User enters an invalid location:
  + non-numeric
  + outside covered area
- No public transport available at required time 


Required data:
- Transport stations
- Transport schedules
- Real time transport times

Initial design idea:
- Communicate with a REST API: send a request containing location and get a list of departure times back
