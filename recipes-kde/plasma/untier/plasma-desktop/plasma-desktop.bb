SUMMARY = "KDE Plasma Desktop"
LICENSE = "GPLv2 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
    file://COPYING.DOC;md5=ad1419ecc56e060eccf8184a87c4285f \
"

inherit kde-plasma gettext

DEPENDS += " \
    libcanberra \
    \
    qtsvg \
    qtdeclarative \
    \
    kauth \
    kauth-native \
    plasma-framework \
    kdoctools \
    kdoctools-native \
    ki18n \
    kcmutils \
    knewstuff \
    kdelibs4support \
    kdelibs4support-native \
    knotifyconfig \
    attica \
    kwallet \
    krunner \
    plasma-workspace \
    kwin \
    kitemmodels \
    kemoticons \
    baloo \
    kpeople \
    kactivities-stats \
    kcoreaddons-native \
    kpackage-native \
    kdesignerplugin-native \
    sonnet-native \
    \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/libx11 libxcb libxkbfile qtx11extras", "", d)} \
"

# REVISIT optionals: find_package(PackageKitQt5 0.9)
DEPENDS += " \
    kactivities \
    libusb1 \
    fontconfig \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "939ec9bc31bb3c89a73163950bdcedda"
SRC_URI[sha256sum] = "109f0d376e7fc2b87e445dcb16edd62407a2941bdbc20fd9c9f0719750efe16e"

SRC_URI += "file://0001-Ensure-xkb_base-is-not-empty-instead-of-checking-if-.patch"

FILES_SOLIBSDEV = "${libdir}/libkfont*${SOLIBSDEV}"

FILES_${PN} += " \
    ${datadir}/k* \
    ${datadir}/appdata \
    ${datadir}/config.kcfg \
    ${datadir}/color-schemes \
    ${datadir}/plasma \
    ${datadir}/dbus-1 \
    ${datadir}/icons \
    ${datadir}/polkit-1 \
    ${datadir}/solid \
    \
    ${libdir}/libkdeinit5_kaccess.so \
    ${OE_QMAKE_PATH_QML} \
    ${libdir}/kauth \
    ${OE_QMAKE_PATH_PLUGINS} \
    ${libdir}/kconf_update_bin \
"

RDEPENDS_${PN} += " \
    qtgraphicaleffects \
    qtquickcontrols-qmlplugins \
"
