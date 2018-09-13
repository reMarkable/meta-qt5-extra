inherit kde-base

#KF5_VERSION = "5.44.0"
KF5_VERSION = "5.36.0"

#SRC_URI = "${KDE_MIRROR}/stable/frameworks/5.44/${BPN}-${PV}.tar.xz"
SRC_URI = "git://anongit.kde.org/${BPN};protocol=git"
SRCREV = "v${PV}"
S="${WORKDIR}/git"
