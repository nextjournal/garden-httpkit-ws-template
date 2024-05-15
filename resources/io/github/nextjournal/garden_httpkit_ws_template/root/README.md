# {{raw-name}}

An example project that demonstrates how to use WebSocket with [HTTPKit](https://github.com/http-kit/http-kit) 
to create a simple chat web application to be hosted on [application.garden](https://application.garden).

This project uses [squint-cljs](https://github.com/squint-cljs/squint) to build frontend code. 

## Development

In development, compile javascript using:

    npm install
    npx squint watch

To start the server locally run

    garden run

your application will be accessible at http://localhost:7777

## Deploy

    garden deploy

will publish your application to https://{{raw-name}}.apps.garden

Copyright © {{now/year}} {{developer}}
