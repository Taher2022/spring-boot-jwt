app.jwt-secret=daf66e01593f61a15b857cf433aae03a005812b31234e149036bcc8dee755dbb
daf66e01593f61a15b857cf433aae03a005812b31234e149036bcc8dee755dbb is encoded and decoded key name is techgen and
can be encoded using online https://emn178.github.io/online-tools/sha256.html

app-jwt-expiration-milliseconds=120000 i.e valid for 2 mins

JWT development steps:->
Add JWT dependency
Create JwtAuthEntryPoint
Add jwt prop in app.prop file
Create JwtTokenProvider
JwtAuthenticationFilter
Create JWTAuthResp DTO
Configure JWT in spring sec config
Change login API to return token to client