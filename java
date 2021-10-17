oc new-app --image-stream=jboss-eap72-openshift:latest --code=https://github.com/vigneshwar006/openshift-tasks.git#eap-7 --name=tasks
--> Found image ec5db8f (2 months old) in image stream "openshift/jboss-eap72-openshift" under tag "latest" for "jboss-eap72-openshift:latest"

    JBoss EAP 7.2
    -------------
    Platform for building and running JavaEE applications on JBoss EAP 7.2

    Tags: builder, javaee, eap, eap7

    * The source repository appears to match: jee
    * A source build using source code from https://github.com/stencell/openshift-tasks.git#eap-7 will be created
      * The resulting image will be pushed to image stream tag "tasks:latest"
      * Use 'oc start-build' to trigger a new build
    * This image will be deployed in deployment config "tasks"
    * Ports 8080/tcp, 8443/tcp, 8778/tcp will be load balanced by service "tasks"
      * Other containers can access this service through the hostname "tasks"

--> Creating resources ...
    imagestream.image.openshift.io "tasks" created
    buildconfig.build.openshift.io "tasks" created
    deploymentconfig.apps.openshift.io "tasks" created
    service "tasks" created
--> Success
    Build scheduled, use 'oc logs -f bc/tasks' to track its progress.
    Application is not exposed. You can expose services to the outside world by executing one or more of the commands below:
     'oc expose svc/tasks'
    Run 'oc status' to view your app.
