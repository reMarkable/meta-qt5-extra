SUMMARY = "KDE oxygen icons"
LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=6e01bfa20e899e8ad569d5488923cbd2 \
"

inherit kde-apps allarch fontcache

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "4f24f975fb90d8daab833fc719ce39a3"
SRC_URI[sha256sum] = "133b66d70b51641f841799674afd993a6af0d9d9b646021a0ed609beb2ffd71e"

FILES_${PN} += " \
    ${datadir}/icons/oxygen \
"
