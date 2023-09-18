# Quarkus kotlin rest sample
## Overview
This framework provides a foundational structure for REST API projects built with Quarkus and Kotlin. Below you'll find descriptions for each directory and their respective responsibilities.

## Directory Structure
### code
Description: Manages all API response codes here. Ensures consistent communication through standardized response codes.
### controller
Description: A collection of controllers responsible for handling API requests. Each controller is in charge of actions for specific endpoints.
### filters
Description: A set of filters that logs all API access. Records every access, including user's IP address.
Integration: Supports GELF log format using Quarkus, allowing logs to be sent to the EFK stack (Elasticsearch, Fluentd, Kibana).
### model
Description: Contains all the Data Transfer Objects (DTOs) and Value Objects (VOs) used in the project. Defines data structures for communication between the client and server.
### service
Description: A collection of service layers that handle tasks requested by controllers. Takes care of core operations like business logic, database access, etc.
### utils
Description: A collection of utility functions or classes that are commonly used throughout the application.

## Overview
이 프레임워크는 Quarkus와 Kotlin으로 구축된 REST API 프로젝트를 위한 기본 구조를 제공합니다. 아래에 각 디렉터리와 해당하는 책임에 대한 설명을 제공합니다.

## Directory Structure
### code
Description: 모든 API 응답 코드를 이곳에서 관리합니다. 표준화된 응답 코드를 이용하여 통신의 일관성을 유지합니다.
### controller
Description: API 요청을 처리하는 컨트롤러의 집합입니다. 각 컨트롤러는 특정 엔드포인트에 대한 동작을 담당합니다.
### filters
Description: 모든 API 액세스 로그를 기록하는 필터의 모음입니다. 사용자의 IP 주소를 포함하여 모든 액세스를 로깅합니다.
Integration: Quarkus를 사용하여 GELF 로그 포맷을 지원하며, 이를 통해 EFK 스택(Elasticsearch, Fluentd, Kibana)에 로그를 전송할 수 있습니다.
### model
Description: 프로젝트에서 사용되는 모든 Data Transfer Objects (DTOs) 및 Value Objects (VOs)를 포함합니다. 이를 통해 클라이언트와 서버 간의 데이터 전송 구조를 정의합니다.
### service
Description: 컨트롤러에서 요청된 작업을 실제로 처리하는 서비스 계층의 집합입니다. 비즈니스 로직, 데이터베이스 액세스 등의 주요 작업을 담당합니다.
### utils
Description: 애플리케이션 전반에 걸쳐 공통적으로 사용되는 유틸리티 함수나 클래스의 집합입니다.

