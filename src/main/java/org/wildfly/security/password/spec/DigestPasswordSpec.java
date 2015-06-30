/*
 * JBoss, Home of Professional Open Source
 * Copyright 2014 Red Hat, Inc., and individual contributors
 * as indicated by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.wildfly.security.password.spec;

/**
 * A {@link PasswordSpec} for a password represented by a Digest Response as seen in DigestMD5 SASL mechanism.
 *
 * @author <a href="mailto:pskopek@redhat.com">Peter Skopek</a>
 * @author <a href="mailto:darran.lofthouse@jboss.com">Darran Lofthouse</a>
 */
public final class DigestPasswordSpec implements PasswordSpec {

    private final String username;
    private final String realm;
    private final byte[] digest;

    public DigestPasswordSpec(String username, String realm, byte[] digest) {
        this.username = username;
        this.realm = realm;
        this.digest = digest;
    }

    public String getUsername() {
        return username;
    }

    public String getRealm() {
        return realm;
    }

    public byte[] getDigest() {
        return digest;
    }

}
