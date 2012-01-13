########## publishing ##########

p2UpdateSiteDir=${WORKSPACE}/buildroot/result/output/org.eclipse.papyrus.extra.build.feature_*-eclipse.feature/site.p2

promoteSignal=/opt/public/modeling/mdt/papyrus/papyrus-trunk-extra-nightly/promoteSignal
promoteDirName=/opt/public/modeling/mdt/papyrus/papyrus-trunk-extra-nightly/promoteDirName
# note: the version and build id used by the cronPromote.sh are taken from papyrus-trunk-nightly

FULL_BUILD_ID=$(cat $promoteDirName)

if [ -n "$BUILD_ALIAS" ]; then
  zipName=Papyrus-Extra-${BUILD_ALIAS}.zip
else
  zipName=Papyrus-Extra-${FULL_BUILD_ID}.zip
fi

rm -rf tmp
mkdir -p "tmp/$FULL_BUILD_ID"

# create the update site zip
(cd $p2UpdateSiteDir && zip -r $zipName *)
mv $p2UpdateSiteDir/$zipName "tmp/$FULL_BUILD_ID"

mv revision.txt "tmp/$FULL_BUILD_ID"

# copy the build log into the result
wget --quiet --no-check-certificate ${HUDSON_URL}/job/${JOB_NAME}/${BUILD_NUMBER}/consoleText -O "${WORKSPACE}/tmp/$FULL_BUILD_ID/buildlog.txt"

(cd tmp && zip -r ${FULL_BUILD_ID}.zip *)
mv tmp/${FULL_BUILD_ID}.zip .

if [ "$BUILD_TYPE" == "N" ]; then
	touch $promoteSignal
fi
