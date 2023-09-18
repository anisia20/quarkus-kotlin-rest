# Quarkus kotlin rest sample
## Overview
This framework provides a foundational structure for REST API projects built with Quarkus and Kotlin. Below you'll find descriptions for each directory and their respective responsibilities.

## Directory Structure
code
Description: Manages all API response codes here. Ensures consistent communication through standardized response codes.
controller
Description: A collection of controllers responsible for handling API requests. Each controller is in charge of actions for specific endpoints.
filters
Description: A set of filters that logs all API access. Records every access, including user's IP address.
Integration: Supports GELF log format using Quarkus, allowing logs to be sent to the EFK stack (Elasticsearch, Fluentd, Kibana).
model
Description: Contains all the Data Transfer Objects (DTOs) and Value Objects (VOs) used in the project. Defines data structures for communication between the client and server.
service
Description: A collection of service layers that handle tasks requested by controllers. Takes care of core operations like business logic, database access, etc.
utils
Description: A collection of utility functions or classes that are commonly used throughout the application.

