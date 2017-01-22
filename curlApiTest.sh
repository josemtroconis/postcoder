#!/bin/bash

printf "\n\n*****\n";
echo "curl -X GET http://localhost:8080/pcw/PCW45-12345-12345-1234X/address/ie/D02X285?lines=3&format=json;";
printf "*****\n\n";
curl -X GET http://localhost:8080/pcw/PCW45-12345-12345-1234X/address/ie/D02X285?lines=3&format=json;
sleep 3;

printf "\n\n*****\n";
echo "curl -X GET http://localhost:8080/pcw/PCW45-12345-12345-1234X/address/ie/D02X285?lines=3&format=xml;";
printf "*****\n\n";
curl -X GET http://localhost:8080/pcw/PCW45-12345-12345-1234X/address/ie/D02X285?lines=3&format=xml;
sleep 3;

printf "\n\n*****\n";
echo "curl -X GET http://localhost:8080/pcw/PCW45-12345-12345-1234X/addressgeo/ie/Adelaide%20Road?format=json;";
printf "*****\n\n";
curl -X GET http://localhost:8080/pcw/PCW45-12345-12345-1234X/addressgeo/ie/Adelaide%20Road?format=json;
sleep 3;

printf "\n\n*****\n";
echo "curl -X GET http://localhost:8080/pcw/PCW45-12345-12345-1234X/addressgeo/ie/Adelaide%20Road?format=xml&lines=3;";
printf "*****\n\n";
curl -X GET http://localhost:8080/pcw/PCW45-12345-12345-1234X/addressgeo/ie/Adelaide%20Road?format=xml&lines=3;
sleep 3;

printf "\n\n*****\n";
echo "curl -X GET http://localhost:8080/pcw/PCW45-12345-12345-1234X/addressgeo/ie/D02X285?format=json&addtags=w3w;";
printf "*****\n\n";
curl -X GET http://localhost:8080/pcw/PCW45-12345-12345-1234X/addressgeo/ie/D02X285?format=json&addtags=w3w;
sleep 3;

printf "\n\n*****\n";
echo "curl -X GET http://localhost:8080/pcw/PCW45-12345-12345-1234X/position/ie/D02X285?format=json;";
printf "*****\n\n";
curl -X GET http://localhost:8080/pcw/PCW45-12345-12345-1234X/position/ie/D02X285?format=json;
sleep 3;

printf "\n\n*****\n";
echo "curl -X GET http://localhost:8080/pcw/PCW45-12345-12345-1234X/position/ie/D02X285?format=xml;";
printf "*****\n\n";
curl -X GET http://localhost:8080/pcw/PCW45-12345-12345-1234X/position/ie/D02X285?format=xml;
sleep 3;

printf "\n\n*****\n";
echo "curl -X GET http://localhost:8080/pcw/PCW45-12345-12345-1234X/rgeo/ie/53.332067/-6.255492?distance=50&format=json;";
printf "*****\n\n";
curl -X GET http://localhost:8080/pcw/PCW45-12345-12345-1234X/rgeo/ie/53.332067/-6.255492?distance=50&format=json;
sleep 3;

printf "\n\n*****\n";
echo "curl -X GET http://localhost:8080/pcw/PCW45-12345-12345-1234X/rgeo/ie/53.332067/-6.255492?distance=50&format=xml&lines=3;";
printf "*****\n\n";
curl -X GET http://localhost:8080/pcw/PCW45-12345-12345-1234X/rgeo/ie/53.332067/-6.255492?distance=50&format=xml&lines=3;
sleep 3;

printf "\n\n*****\n";
echo "curl -X GET http://localhost:8080/pcw/PCW45-12345-12345-1234X/address/uk/NR147PZ?format=json;";
printf "*****\n\n";
curl -X GET http://localhost:8080/pcw/PCW45-12345-12345-1234X/address/uk/NR147PZ?format=json;
sleep 3;

printf "\n\n*****\n";
echo "curl -X GET http://localhost:8080/pcw/PCW45-12345-12345-1234X/address/uk/NR147PZ?format=xml;";
printf "*****\n\n";
curl -X GET http://localhost:8080/pcw/PCW45-12345-12345-1234X/address/uk/NR147PZ?format=xml;
sleep 3;

printf "\n\n*****\n";
echo "curl -X GET http://localhost:8080/pcw/PCW45-12345-12345-1234X/address/uk/manor%20farm%20barns?format=xml;";
printf "*****\n\n";
curl -X GET http://localhost:8080/pcw/PCW45-12345-12345-1234X/address/uk/manor%20farm%20barns?format=xml;
sleep 3;

printf "\n\n*****\n";
echo "curl -X GET http://localhost:8080/pcw/PCW45-12345-12345-1234X/address/uk/NR147PZ?format=json&lines=3;";
printf "*****\n\n";
curl -X GET http://localhost:8080/pcw/PCW45-12345-12345-1234X/address/uk/NR147PZ?format=json&lines=3;
sleep 3;