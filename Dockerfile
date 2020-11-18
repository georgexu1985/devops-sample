FROM FROM deploy.bocloud/abcsys/nginx:1.13-alpine 
MAINTAINER hanyun
COPY dist /etc/nginx/micro_vue
CMD [ "nginx", "-g", "daemon off;"]